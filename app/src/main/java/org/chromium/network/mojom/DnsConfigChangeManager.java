
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/host_resolver.mojom
//

package org.chromium.network.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface DnsConfigChangeManager extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends DnsConfigChangeManager, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<DnsConfigChangeManager, DnsConfigChangeManager.Proxy> MANAGER = DnsConfigChangeManager_Internal.MANAGER;


    void requestNotifications(
DnsConfigChangeManagerClient clientPtr);


}
