package protocolsupport.protocol.typeremapper.entity.format.metadata.types.living;

import protocolsupport.protocol.typeremapper.entity.format.metadata.object.value.NetworkEntityMetadataObjectIndexValueNoOpTransformer;
import protocolsupport.protocol.typeremapper.entity.format.metadata.types.base.InsentientNetworkEntityMetadataFormatTransformerFactory;
import protocolsupport.protocol.types.networkentity.metadata.NetworkEntityMetadataObjectIndex;
import protocolsupport.protocol.utils.ProtocolVersionsHelper;

public class BasePiglingNetworkEntityMetadataFormatTransformerFactory extends InsentientNetworkEntityMetadataFormatTransformerFactory {

	public static final BasePiglingNetworkEntityMetadataFormatTransformerFactory INSTANCE = new BasePiglingNetworkEntityMetadataFormatTransformerFactory();

	protected BasePiglingNetworkEntityMetadataFormatTransformerFactory() {
		add(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.BasePiglin.ZOMBIFICATION_IMMUNITY, 16), ProtocolVersionsHelper.UP_1_17);
		add(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.BasePiglin.ZOMBIFICATION_IMMUNITY, 15), ProtocolVersionsHelper.RANGE__1_16_2__1_16_4);
		add(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.BasePiglin.ZOMBIFICATION_IMMUNITY, 16), ProtocolVersionsHelper.RANGE__1_16__1_16_1);
	}

}
