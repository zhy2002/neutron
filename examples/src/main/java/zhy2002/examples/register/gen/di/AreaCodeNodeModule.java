package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.register.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class AreaCodeNodeModule {

    private final AreaCodeNode owner;

    public AreaCodeNodeModule(AreaCodeNode owner) {
        this.owner = owner;
    }

    @Provides @AreaCodeNodeScope @Owner AreaCodeNode provideAreaCodeNode() {
        return owner;
    }

    @Provides @AreaCodeNodeScope @Owner PhoneInfoFieldNode providePhoneInfoFieldNode() {
        return owner;
    }

    @Provides @AreaCodeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @AreaCodeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @AreaCodeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}