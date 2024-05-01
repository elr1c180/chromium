
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/cache_storage/cache_storage.mojom
//

package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public final class OpenResult extends org.chromium.mojo.bindings.Union {

    public static final class Tag {
        public static final int Status = 0;
        public static final int Cache = 1;
    };
    private int mStatus;
    private org.chromium.mojo.bindings.AssociatedInterfaceNotSupported mCache;

    public void setStatus(int status) {
        this.mTag = Tag.Status;
        this.mStatus = status;
    }

    public int getStatus() {
        assert this.mTag == Tag.Status;
        return this.mStatus;
    }

    public void setCache(org.chromium.mojo.bindings.AssociatedInterfaceNotSupported cache) {
        this.mTag = Tag.Cache;
        this.mCache = cache;
    }

    public org.chromium.mojo.bindings.AssociatedInterfaceNotSupported getCache() {
        assert this.mTag == Tag.Cache;
        return this.mCache;
    }


    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder0, int offset) {
        encoder0.encode(org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (mTag) {
            case Tag.Status: {
                
                encoder0.encode(this.mStatus, offset + 8);
                break;
            }
            case Tag.Cache: {
                
                encoder0.encode(this.mCache, offset + 8, false);
                break;
            }
            default: {
                break;
            }
        }
    }

    public static OpenResult deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final OpenResult decode(org.chromium.mojo.bindings.Decoder decoder0, int offset) {
        org.chromium.mojo.bindings.DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        OpenResult result = new OpenResult();
        switch (dataHeader.elementsOrVersion) {
            case Tag.Status: {
                
                result.mStatus = decoder0.readInt(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE);
                    CacheStorageError.validate(result.mStatus);
                result.mTag = Tag.Status;
                break;
            }
            case Tag.Cache: {
                
                result.mCache = decoder0.readAssociatedServiceInterfaceNotSupported(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mTag = Tag.Cache;
                break;
            }
            default: {
                break;
            }
        }
        return result;
    }
}