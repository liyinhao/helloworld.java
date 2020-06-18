/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache license, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the license for the specific language governing permissions and
 * limitations under the license.
 */
package example.log4j2;

import org.apache.logging.log4j.message.*;

/**
 * Creates {@link FormattedMessage} instances for {@link MessageFactory2} methods (and {@link MessageFactory} by
 * extension.)
 * <p>
 * Enables the use of <code>{}</code> parameter markers in message strings.
 * </p>
 * <p>
 * Creates {@link ParameterizedMessage} instances for {@link #newMessage(String, Object...)}.
 * </p>
 * <p>
 * This class is immutable.
 * </p>
 *
 * <h4>Note to implementors</h4>
 * <p>
 * This class implements all {@link MessageFactory2} methods.
 * </p>
 */
public final class CustomParameterizedMessageFactory extends AbstractMessageFactory {
    /**
     * Instance of ParameterizedMessageFactory.
     */
    public static final CustomParameterizedMessageFactory INSTANCE = new CustomParameterizedMessageFactory();

    private static final long serialVersionUID = -8970940216592525651L;

    /**
     * Constructs a message factory.
     */
    public CustomParameterizedMessageFactory() {
        super();
    }

    private String getMessage(Object old){
        old = String.valueOf(old);
        return "@#[this_is_messageId]@#" + old;
    }

    @Override
    public Message newMessage(CharSequence message) {
        return super.newMessage(getMessage(message));
    }

    @Override
    public Message newMessage(Object message) {
        return super.newMessage(getMessage(message));
    }

    @Override
    public Message newMessage(String message) {
        return super.newMessage(getMessage(message));
    }

    /**
     * Creates {@link ParameterizedMessage} instances.
     *
     * @param message The message pattern.
     * @param params The message parameters.
     * @return The Message.
     *
     * @see MessageFactory#newMessage(String, Object...)
     */
    @Override
    public Message newMessage(final String message, final Object... params) {
        return new ParameterizedMessage(getMessage(message), params);
    }

    /**
     * @since 2.6.1
     */
    @Override
    public Message newMessage(final String message, final Object p0) {
        return new ParameterizedMessage(getMessage(message), p0);
    }

    /**
     * @since 2.6.1
     */
    @Override
    public Message newMessage(final String message, final Object p0, final Object p1) {
        return new ParameterizedMessage(getMessage(message), p0, p1);
    }

    /**
     * @since 2.6.1
     */
    @Override
    public Message newMessage(final String message, final Object p0, final Object p1, final Object p2) {
        return new ParameterizedMessage(getMessage(message), p0, p1, p2);
    }

    /**
     * @since 2.6.1
     */
    @Override
    public Message newMessage(final String message, final Object p0, final Object p1, final Object p2, final Object p3) {
        return new ParameterizedMessage(getMessage(message), p0, p1, p2, p3);
    }

    /**
     * @since 2.6.1
     */
    @Override
    public Message newMessage(final String message, final Object p0, final Object p1, final Object p2, final Object p3, final Object p4) {
        return new ParameterizedMessage(getMessage(message), p0, p1, p2, p3, p4);
    }

    /**
     * @since 2.6.1
     */
    @Override
    public Message newMessage(final String message, final Object p0, final Object p1, final Object p2, final Object p3, final Object p4, final Object p5) {
        return new ParameterizedMessage(getMessage(message), p0, p1, p2, p3, p4, p5);
    }

    /**
     * @since 2.6.1
     */
    @Override
    public Message newMessage(final String message, final Object p0, final Object p1, final Object p2, final Object p3, final Object p4, final Object p5,
            final Object p6) {
        return new ParameterizedMessage(getMessage(message), p0, p1, p2, p3, p4, p5, p6);
    }

    /**
     * @since 2.6.1
     */
    @Override
    public Message newMessage(final String message, final Object p0, final Object p1, final Object p2, final Object p3, final Object p4, final Object p5,
            final Object p6, final Object p7) {
        return new ParameterizedMessage(getMessage(message), p0, p1, p2, p3, p4, p5, p6, p7);
    }

    /**
     * @since 2.6.1
     */
    @Override
    public Message newMessage(final String message, final Object p0, final Object p1, final Object p2, final Object p3, final Object p4, final Object p5,
            final Object p6, final Object p7, final Object p8) {
        return new ParameterizedMessage(getMessage(message), p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    /**
     * @since 2.6.1
     */
    @Override
    public Message newMessage(final String message, final Object p0, final Object p1, final Object p2, final Object p3, final Object p4, final Object p5,
            final Object p6, final Object p7, final Object p8, final Object p9) {
        return new ParameterizedMessage(getMessage(message), p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }
}
