package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.register.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ErrorNodeModule {

    private final ErrorNode owner;

    public ErrorNodeModule(ErrorNode owner) {
        this.owner = owner;
    }

    @Provides @ErrorNodeScope @Owner ErrorNode provideErrorNode() {
        return owner;
    }

    @Provides @ErrorNodeScope @Owner ValidationErrorUiNode<?> provideValidationErrorUiNode() {
        return owner;
    }

    @Provides @ErrorNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ErrorNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}