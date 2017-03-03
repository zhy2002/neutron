package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PasswordNodeModule {

    private final PasswordNode owner;

    public PasswordNodeModule(PasswordNode owner) {
        this.owner = owner;
    }

    @Provides @PasswordNodeScope @Owner PasswordNode providePasswordNode() {
        return owner;
    }

    @Provides @PasswordNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @PasswordNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PasswordNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}