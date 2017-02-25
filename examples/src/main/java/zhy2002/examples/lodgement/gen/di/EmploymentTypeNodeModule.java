package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class EmploymentTypeNodeModule {

    private final EmploymentTypeNode owner;

    public EmploymentTypeNodeModule(EmploymentTypeNode owner) {
        this.owner = owner;
    }

    @Provides @EmploymentTypeNodeScope @Owner EmploymentTypeNode provideEmploymentTypeNode() {
        return owner;
    }

    @Provides @EmploymentTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @EmploymentTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @EmploymentTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}