package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class SavingsAccountNoNodeModule {

    private final SavingsAccountNoNode owner;

    public SavingsAccountNoNodeModule(SavingsAccountNoNode owner) {
        this.owner = owner;
    }

    @Provides @SavingsAccountNoNodeScope @Owner SavingsAccountNoNode provideSavingsAccountNoNode() {
        return owner;
    }

    @Provides @SavingsAccountNoNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @SavingsAccountNoNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @SavingsAccountNoNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}