package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ErrorListNodeModule {

    private final ErrorListNode owner;

    public ErrorListNodeModule(ErrorListNode owner) {
        this.owner = owner;
    }

    @Provides @ErrorListNodeScope @Owner ErrorListNode provideErrorListNode() {
        return owner;
    }

    @Provides @ErrorListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ErrorListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ErrorListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ErrorListNodeScope RegisterNode provideRegisterNode() {
        return owner.getParent();
    }

}