/*
 * Copyright (C) 2012 RoboVM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.rt.bro.ptr;

import org.robovm.rt.bro.Struct;
import org.robovm.rt.bro.annotation.StructMember;

/**
 * Points to an 8-bit signed value (<code>char *</code> in C).
 */
public final class BytePtr extends Struct<BytePtr> {
    /**
     * Creates a new {@link BytePtr} with a value of 0.
     */
    public BytePtr() {
    }
    
    /**
     * Creates a new {@link BytePtr} and initializes it with the specified value.
     * 
     * @param value the value.
     */
    public BytePtr(byte value) {
        set(value);
    }

    /**
     * Returns the current value.
     * 
     * @return the value.
     */
    @StructMember(0)
    public native byte get();
    
    /**
     * Sets the value.
     * 
     * @param value the new value.
     */
    @StructMember(0)
    public native void set(byte value);
}