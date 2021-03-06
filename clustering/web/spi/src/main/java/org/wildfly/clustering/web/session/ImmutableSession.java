/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2013, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.wildfly.clustering.web.session;

/**
 * Represents an immutable view of a web session.
 * @author Paul Ferraro
 */
public interface ImmutableSession {
    /**
     * Specifies this session's unique identifier.
     * @return a unique identifier for this session.
     */
    String getId();

    /**
     * Abstraction for session meta information.
     * @return this session's meta data
     * @throws IllegalStateException if this session is invalid
     */
    ImmutableSessionMetaData getMetaData();

    /**
     * Indicates whether or not this session was invalidated.
     * @return true if this session is still valid, false otherwise.
     */
    boolean isValid();

    /**
     * Abstraction for accessing and manipulating session attributes.
     * @return this session's attributes
     * @throws IllegalStateException if this session is invalid
     */
    ImmutableSessionAttributes getAttributes();

    /**
     * The application context of this session.
     * @return the session's context
     */
    SessionContext getContext();
}
