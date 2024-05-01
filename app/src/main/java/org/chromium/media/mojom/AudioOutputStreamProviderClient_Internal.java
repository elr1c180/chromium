
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/interfaces/audio_output_stream.mojom
//

package org.chromium.media.mojom;

import org.chromium.mojo.bindings.DeserializationException;


class AudioOutputStreamProviderClient_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<AudioOutputStreamProviderClient, AudioOutputStreamProviderClient.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<AudioOutputStreamProviderClient, AudioOutputStreamProviderClient.Proxy>() {

        @Override
        public String getName() {
            return "media.mojom.AudioOutputStreamProviderClient";
        }

        @Override
        public int getVersion() {
          return 0;
        }

        @Override
        public Proxy buildProxy(org.chromium.mojo.system.Core core,
                                org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override
        public Stub buildStub(org.chromium.mojo.system.Core core, AudioOutputStreamProviderClient impl) {
            return new Stub(core, impl);
        }

        @Override
        public AudioOutputStreamProviderClient[] buildArray(int size) {
          return new AudioOutputStreamProviderClient[size];
        }
    };


    private static final int CREATED_ORDINAL = 0;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements AudioOutputStreamProviderClient.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void created(
AudioOutputStream stream, ReadWriteAudioDataPipe dataPipe) {

            AudioOutputStreamProviderClientCreatedParams _message = new AudioOutputStreamProviderClientCreatedParams();

            _message.stream = stream;

            _message.dataPipe = dataPipe;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(CREATED_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<AudioOutputStreamProviderClient> {

        Stub(org.chromium.mojo.system.Core core, AudioOutputStreamProviderClient impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.NO_FLAG)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(
                                AudioOutputStreamProviderClient_Internal.MANAGER, messageWithHeader);





                    case CREATED_ORDINAL: {

                        AudioOutputStreamProviderClientCreatedParams data =
                                AudioOutputStreamProviderClientCreatedParams.deserialize(messageWithHeader.getPayload());

                        getImpl().created(data.stream, data.dataPipe);
                        return true;
                    }


                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }

        @Override
        public boolean acceptWithResponder(org.chromium.mojo.bindings.Message message, org.chromium.mojo.bindings.MessageReceiver receiver) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(
                                getCore(), AudioOutputStreamProviderClient_Internal.MANAGER, messageWithHeader, receiver);




                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class AudioOutputStreamProviderClientCreatedParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public AudioOutputStream stream;
        public ReadWriteAudioDataPipe dataPipe;

        private AudioOutputStreamProviderClientCreatedParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public AudioOutputStreamProviderClientCreatedParams() {
            this(0);
        }

        public static AudioOutputStreamProviderClientCreatedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static AudioOutputStreamProviderClientCreatedParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static AudioOutputStreamProviderClientCreatedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            AudioOutputStreamProviderClientCreatedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new AudioOutputStreamProviderClientCreatedParams(elementsOrVersion);
                    {
                        
                    result.stream = decoder0.readServiceInterface(8, false, AudioOutputStream.MANAGER);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                    result.dataPipe = ReadWriteAudioDataPipe.decode(decoder1);
                    }

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            
            encoder0.encode(this.stream, 8, false, AudioOutputStream.MANAGER);
            
            encoder0.encode(this.dataPipe, 16, false);
        }
    }



}
