package protocolsupport.protocol.packet.middleimpl.clientbound.play.v_8;

import java.util.Collections;

import protocolsupport.protocol.packet.ClientBoundPacketType;
import protocolsupport.protocol.packet.PacketDataCodec;
import protocolsupport.protocol.packet.middleimpl.ClientBoundPacketData;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7_8.AbstractPassengerStackEntityDestroy;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7_8.AbstractPassengerStackEntityPassengers;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7_8.AbstractPassengerStackEntityPassengers.NetworkEntityVehicleData;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_6_7_8.EntityPassengers;
import protocolsupport.protocol.serializer.VarNumberSerializer;

public class EntityDestroy extends AbstractPassengerStackEntityDestroy {

	public EntityDestroy(MiddlePacketInit init) {
		super(init);
	}

	@Override
	protected void writeRemovePassengers(NetworkEntityVehicleData entity) {
		AbstractPassengerStackEntityPassengers.writeVehiclePassengers(codec, EntityPassengers::create, entity, Collections.emptyList());
	}

	@Override
	protected void writeLeaveVehicle(NetworkEntityVehicleData entity) {
		AbstractPassengerStackEntityPassengers.writeLeaveVehicleConnectStack(codec, EntityPassengers::create, entity);
	}

	@Override
	protected void writeDestroyEntity(int entityId) {
		writeDestroyEntity(codec, entityId);
	}


	public static void writeDestroyEntity(PacketDataCodec codec, int entityId) {
		ClientBoundPacketData entitydestroyPacket = ClientBoundPacketData.create(ClientBoundPacketType.CLIENTBOUND_PLAY_ENTITY_DESTROY);
		VarNumberSerializer.writeVarInt(entitydestroyPacket, 1); //entity array length
		VarNumberSerializer.writeVarInt(entitydestroyPacket, entityId);
		codec.writeClientbound(entitydestroyPacket);
	}

}
