package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class AccessCompanyNameNodeModule {

    private final AccessCompanyNameNode owner;

    public AccessCompanyNameNodeModule(AccessCompanyNameNode owner) {
        this.owner = owner;
    }

    @Provides @AccessCompanyNameNodeScope @Owner AccessCompanyNameNode provideAccessCompanyNameNode() {
        return owner;
    }

    @Provides @AccessCompanyNameNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @AccessCompanyNameNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @AccessCompanyNameNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}