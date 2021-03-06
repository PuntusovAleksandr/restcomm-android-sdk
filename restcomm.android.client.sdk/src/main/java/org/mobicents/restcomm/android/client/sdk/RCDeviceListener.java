/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2015, Telestax Inc and individual contributors
 * by the @authors tag.
 *
 * This program is free software: you can redistribute it and/or modify
 * under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 *
 * For questions related to commercial use licensing, please contact sales@telestax.com.
 *
 */

package org.mobicents.restcomm.android.client.sdk;

import org.mobicents.restcomm.android.client.sdk.RCDevice;

import java.util.HashMap;

public interface RCDeviceListener {
    public abstract void onStartListening(RCDevice device);
    public abstract void onStopListening(RCDevice device);
    public abstract void onStopListening(RCDevice device, int errorCode, String errorText);
    public abstract boolean receivePresenceEvents(RCDevice device);
    // TODO: this should be removed and handled via Android Intents, but to make some tests let's leave it as-is for now
    public abstract void onIncomingConnection(RCDevice device, RCConnection connection);
    public abstract void onIncomingMessage(RCDevice device, String message, HashMap<String, String> parameters);
    public abstract void onPresenceChanged(RCDevice device, RCPresenceEvent presenceEvent);
}
