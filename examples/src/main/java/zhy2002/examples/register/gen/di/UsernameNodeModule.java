package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.register.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class UsernameNodeModule {

    private final UsernameNode owner;

    public UsernameNodeModule(UsernameNode owner) {
        this.owner = owner;
    }

    @Provides @UsernameNodeScope @Owner UsernameNode provideUsernameNode() {
        return owner;
    }

    @Provides @UsernameNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @UsernameNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @UsernameNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}