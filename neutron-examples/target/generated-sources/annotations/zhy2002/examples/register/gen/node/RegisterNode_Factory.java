package zhy2002.examples.register.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.register.gen.RegisterNodeContext;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RegisterNode_Factory implements Factory<RegisterNode> {
  private final MembersInjector<RegisterNode> registerNodeMembersInjector;

  private final Provider<RegisterNodeContext> contextProvider;

  public RegisterNode_Factory(
      MembersInjector<RegisterNode> registerNodeMembersInjector,
      Provider<RegisterNodeContext> contextProvider) {
    assert registerNodeMembersInjector != null;
    this.registerNodeMembersInjector = registerNodeMembersInjector;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  @Override
  public RegisterNode get() {
    return MembersInjectors.injectMembers(
        registerNodeMembersInjector, new RegisterNode(contextProvider.get()));
  }

  public static Factory<RegisterNode> create(
      MembersInjector<RegisterNode> registerNodeMembersInjector,
      Provider<RegisterNodeContext> contextProvider) {
    return new RegisterNode_Factory(registerNodeMembersInjector, contextProvider);
  }
}
