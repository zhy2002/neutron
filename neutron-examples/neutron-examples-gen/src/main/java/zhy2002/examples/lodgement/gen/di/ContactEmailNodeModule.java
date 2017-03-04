package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ContactEmailNodeModule {

    private final ContactEmailNode owner;

    public ContactEmailNodeModule(ContactEmailNode owner) {
        this.owner = owner;
    }

    @Provides @ContactEmailNodeScope @Owner ContactEmailNode provideContactEmailNode() {
        return owner;
    }

    @Provides @ContactEmailNodeScope @Owner EmailNode<?> provideEmailNode() {
        return owner;
    }

    @Provides @ContactEmailNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ContactEmailNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ContactEmailNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ContactEmailNodeScope BaseContactNode<?> provideBaseContactNode() {
        return owner.getParent();
    }

}