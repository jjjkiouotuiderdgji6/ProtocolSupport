package protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7_8_9r1_9r2_10_11_12r1_12r2_13;

import protocolsupport.protocol.packet.middleimpl.ClientBoundPacketData;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16r1_16r2.AbstractRemappedEntityMetadata;
import protocolsupport.protocol.serializer.NetworkEntityMetadataSerializer.NetworkEntityMetadataList;
import protocolsupport.protocol.types.Position;
import protocolsupport.protocol.types.networkentity.NetworkEntityType;
import protocolsupport.protocol.types.networkentity.metadata.NetworkEntityMetadataObjectIndex;
import protocolsupport.protocol.types.networkentity.metadata.objects.NetworkEntityMetadataObjectOptionalPosition;

public abstract class AbstractUseBedPacketEntityMetadata extends AbstractRemappedEntityMetadata {

	public AbstractUseBedPacketEntityMetadata(MiddlePacketInit init) {
		super(init);
	}

	@Override
	public void writeToClient() {
		codec.write(createEntityMetadata(rMetadata));

		if (entity.getType() == NetworkEntityType.PLAYER) {
			NetworkEntityMetadataObjectOptionalPosition bedpositionObject = NetworkEntityMetadataObjectIndex.EntityLiving.BED_LOCATION.getObject(metadata);
			if (bedpositionObject != null) {
				Position bedposition = bedpositionObject.getValue();
				if (bedposition != null) {
					codec.write(createUseBed(bedposition));
				}
			}
		}
	}

	protected abstract ClientBoundPacketData createEntityMetadata(NetworkEntityMetadataList remappedMetadata);

	protected abstract ClientBoundPacketData createUseBed(Position position);

}
