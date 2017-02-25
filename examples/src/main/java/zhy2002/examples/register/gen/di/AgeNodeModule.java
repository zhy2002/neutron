package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.register.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class AgeNodeModule {

    private final AgeNode owner;

    public AgeNodeModule(AgeNode owner) {
        this.owner = owner;
    }

    @Provides @AgeNodeScope @Owner AgeNode provideAgeNode() {
        return owner;
    }

    @Provides @AgeNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @AgeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @AgeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}