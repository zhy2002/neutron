package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class SavingsTypeNodeModule {

    private final SavingsTypeNode owner;

    public SavingsTypeNodeModule(SavingsTypeNode owner) {
        this.owner = owner;
    }

    @Provides @SavingsTypeNodeScope @Owner SavingsTypeNode provideSavingsTypeNode() {
        return owner;
    }

    @Provides @SavingsTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @SavingsTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @SavingsTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}