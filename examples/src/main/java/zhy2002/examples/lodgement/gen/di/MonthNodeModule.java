package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class MonthNodeModule {

    private final MonthNode owner;

    public MonthNodeModule(MonthNode owner) {
        this.owner = owner;
    }

    @Provides @MonthNodeScope @Owner MonthNode provideMonthNode() {
        return owner;
    }

    @Provides @MonthNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @MonthNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @MonthNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}