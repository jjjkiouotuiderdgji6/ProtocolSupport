package protocolsupport.protocol.typeremapper.entity.format.metadata.types.living.horse;

import protocolsupport.protocol.typeremapper.entity.format.metadata.object.value.NetworkEntityMetadataObjectIndexValueNoOpTransformer;
import protocolsupport.protocol.typeremapper.entity.format.metadata.object.value.NetworkEntityMetadataObjectIndexValueNumberToIntTransformer;
import protocolsupport.protocol.typeremapper.entity.format.metadata.types.base.AgeableNetworkEntityMetadataFormatTransformerFactory;
import protocolsupport.protocol.types.networkentity.metadata.NetworkEntityMetadataObjectIndex;
import protocolsupport.protocol.utils.ProtocolVersionsHelper;

public class BaseHorseNetworkEntityMetadataFormatTransformerFactory extends AgeableNetworkEntityMetadataFormatTransformerFactory {

	public static final BaseHorseNetworkEntityMetadataFormatTransformerFactory INSTANCE = new BaseHorseNetworkEntityMetadataFormatTransformerFactory();

	protected BaseHorseNetworkEntityMetadataFormatTransformerFactory() {
		add(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.BaseHorse.HORSE_FLAGS, 17), ProtocolVersionsHelper.UP_1_17);
		add(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.BaseHorse.HORSE_FLAGS, 16), ProtocolVersionsHelper.RANGE__1_15__1_16_4);
		add(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.BaseHorse.HORSE_FLAGS, 15), ProtocolVersionsHelper.ALL_1_14);
		add(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.BaseHorse.HORSE_FLAGS, 13), ProtocolVersionsHelper.RANGE__1_10__1_13_2);
		add(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.BaseHorse.HORSE_FLAGS, 12), ProtocolVersionsHelper.ALL_1_9);
		add(new NetworkEntityMetadataObjectIndexValueNumberToIntTransformer(NetworkEntityMetadataObjectIndex.BaseHorse.HORSE_FLAGS, 16), ProtocolVersionsHelper.DOWN_1_8);

		add(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.BaseHorse.OWNER, 18), ProtocolVersionsHelper.UP_1_17);
		add(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.BaseHorse.OWNER, 17), ProtocolVersionsHelper.RANGE__1_15__1_16_4);
		add(new NetworkEntityMetadataObjectIndexValueNoOpTransformer(NetworkEntityMetadataObjectIndex.BaseHorse.OWNER, 16), ProtocolVersionsHelper.ALL_1_14);
	}

}
