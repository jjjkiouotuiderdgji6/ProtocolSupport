package protocolsupport.protocol.packet.middle.serverbound.login;

import protocolsupport.protocol.packet.ServerBoundPacketType;
import protocolsupport.protocol.packet.middle.ServerBoundMiddlePacket;
import protocolsupport.protocol.packet.middleimpl.ServerBoundPacketData;
import protocolsupport.protocol.serializer.StringSerializer;

public abstract class MiddleLoginStart extends ServerBoundMiddlePacket {

	protected MiddleLoginStart(MiddlePacketInit init) {
		super(init);
	}

	protected String name;

	@Override
	protected void write() {
		ServerBoundPacketData loginstart = ServerBoundPacketData.create(ServerBoundPacketType.SERVERBOUND_LOGIN_START);
		StringSerializer.writeVarIntUTF8String(loginstart, name);
		codec.writeServerbound(loginstart);
	}

}
