package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class EstimatedMarketValueNodeModule {

    private final EstimatedMarketValueNode owner;

    public EstimatedMarketValueNodeModule(EstimatedMarketValueNode owner) {
        this.owner = owner;
    }

    @Provides @EstimatedMarketValueNodeScope @Owner EstimatedMarketValueNode provideEstimatedMarketValueNode() {
        return owner;
    }

    @Provides @EstimatedMarketValueNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @EstimatedMarketValueNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @EstimatedMarketValueNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @EstimatedMarketValueNodeScope PropertyNode providePropertyNode() {
        return owner.getParent();
    }

}