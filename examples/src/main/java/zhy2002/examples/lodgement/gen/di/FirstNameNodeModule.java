package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class FirstNameNodeModule {

    private final FirstNameNode owner;

    public FirstNameNodeModule(FirstNameNode owner) {
        this.owner = owner;
    }

    @Provides @FirstNameNodeScope @Owner FirstNameNode provideFirstNameNode() {
        return owner;
    }

    @Provides @FirstNameNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @FirstNameNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @FirstNameNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}