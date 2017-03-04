package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class SavingsBsbNoNodeModule {

    private final SavingsBsbNoNode owner;

    public SavingsBsbNoNodeModule(SavingsBsbNoNode owner) {
        this.owner = owner;
    }

    @Provides @SavingsBsbNoNodeScope @Owner SavingsBsbNoNode provideSavingsBsbNoNode() {
        return owner;
    }

    @Provides @SavingsBsbNoNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @SavingsBsbNoNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @SavingsBsbNoNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @SavingsBsbNoNodeScope SavingsAccountNode provideSavingsAccountNode() {
        return owner.getParent();
    }

}