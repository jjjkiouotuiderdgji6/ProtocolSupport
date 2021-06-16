package protocolsupport.protocol.pipeline.version.v_l;

import protocolsupport.protocol.packet.ClientBoundPacketType;
import protocolsupport.protocol.pipeline.version.util.codec.BytePacketCodec;

public class PacketCodec extends BytePacketCodec {

	protected static final PacketCodec instance = new PacketCodec();

	{
		registry.register(ClientBoundPacketType.CLIENTBOUND_LOGIN_DISCONNECT, 0xFF);
		registry.register(ClientBoundPacketType.CLIENTBOUND_STATUS_SERVER_INFO, 0xFF);
	}

}
