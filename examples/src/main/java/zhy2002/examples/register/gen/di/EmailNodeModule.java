package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.register.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class EmailNodeModule {

    private final EmailNode owner;

    public EmailNodeModule(EmailNode owner) {
        this.owner = owner;
    }

    @Provides @EmailNodeScope @Owner EmailNode provideEmailNode() {
        return owner;
    }

    @Provides @EmailNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @EmailNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @EmailNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}