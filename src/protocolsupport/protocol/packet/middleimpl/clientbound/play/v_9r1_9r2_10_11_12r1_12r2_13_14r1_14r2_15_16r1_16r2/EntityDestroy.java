package protocolsupport.protocol.packet.middleimpl.clientbound.play.v_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16r1_16r2;

import protocolsupport.protocol.packet.PacketType;
import protocolsupport.protocol.packet.middle.clientbound.play.MiddleEntityDestroy;
import protocolsupport.protocol.packet.middleimpl.ClientBoundPacketData;
import protocolsupport.protocol.serializer.VarNumberSerializer;

public class EntityDestroy extends MiddleEntityDestroy {

	public EntityDestroy(MiddlePacketInit init) {
		super(init);
	}

	@Override
	protected void write() {
		codec.writeClientbound(create(entityId));
	}

	public static ClientBoundPacketData create(int entityId) {
		ClientBoundPacketData entitydestroyPacket = ClientBoundPacketData.create(PacketType.CLIENTBOUND_PLAY_ENTITY_DESTROY);
		VarNumberSerializer.writeVarInt(entitydestroyPacket, 1); //entity array length
		VarNumberSerializer.writeVarInt(entitydestroyPacket, entityId);
		return entitydestroyPacket;
	}

}
