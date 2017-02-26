package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class SavingsAccountNodeModule {

    private final SavingsAccountNode owner;

    public SavingsAccountNodeModule(SavingsAccountNode owner) {
        this.owner = owner;
    }

    @Provides @SavingsAccountNodeScope @Owner SavingsAccountNode provideSavingsAccountNode() {
        return owner;
    }

    @Provides @SavingsAccountNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @SavingsAccountNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @SavingsAccountNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}