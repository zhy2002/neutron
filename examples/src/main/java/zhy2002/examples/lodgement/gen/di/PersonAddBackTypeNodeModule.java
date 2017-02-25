package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PersonAddBackTypeNodeModule {

    private final PersonAddBackTypeNode owner;

    public PersonAddBackTypeNodeModule(PersonAddBackTypeNode owner) {
        this.owner = owner;
    }

    @Provides @PersonAddBackTypeNodeScope @Owner PersonAddBackTypeNode providePersonAddBackTypeNode() {
        return owner;
    }

    @Provides @PersonAddBackTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @PersonAddBackTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PersonAddBackTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}