package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ContractPriceNodeModule {

    private final ContractPriceNode owner;

    public ContractPriceNodeModule(ContractPriceNode owner) {
        this.owner = owner;
    }

    @Provides @ContractPriceNodeScope @Owner ContractPriceNode provideContractPriceNode() {
        return owner;
    }

    @Provides @ContractPriceNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @ContractPriceNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ContractPriceNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}