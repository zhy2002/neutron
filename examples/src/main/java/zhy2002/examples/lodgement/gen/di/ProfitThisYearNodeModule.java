package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProfitThisYearNodeModule {

    private final ProfitThisYearNode owner;

    public ProfitThisYearNodeModule(ProfitThisYearNode owner) {
        this.owner = owner;
    }

    @Provides @ProfitThisYearNodeScope @Owner ProfitThisYearNode provideProfitThisYearNode() {
        return owner;
    }

    @Provides @ProfitThisYearNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @ProfitThisYearNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProfitThisYearNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}