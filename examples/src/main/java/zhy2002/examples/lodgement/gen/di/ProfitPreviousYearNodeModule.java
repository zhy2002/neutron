package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProfitPreviousYearNodeModule {

    private final ProfitPreviousYearNode owner;

    public ProfitPreviousYearNodeModule(ProfitPreviousYearNode owner) {
        this.owner = owner;
    }

    @Provides @ProfitPreviousYearNodeScope @Owner ProfitPreviousYearNode provideProfitPreviousYearNode() {
        return owner;
    }

    @Provides @ProfitPreviousYearNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @ProfitPreviousYearNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProfitPreviousYearNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}