package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class Product100PercentOffsetFlagNodeModule {

    private final Product100PercentOffsetFlagNode owner;

    public Product100PercentOffsetFlagNodeModule(Product100PercentOffsetFlagNode owner) {
        this.owner = owner;
    }

    @Provides @Product100PercentOffsetFlagNodeScope @Owner Product100PercentOffsetFlagNode provideProduct100PercentOffsetFlagNode() {
        return owner;
    }

    @Provides @Product100PercentOffsetFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @Product100PercentOffsetFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @Product100PercentOffsetFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @Product100PercentOffsetFlagNodeScope ProductFeaturesNode provideProductFeaturesNode() {
        return owner.getParent();
    }

}