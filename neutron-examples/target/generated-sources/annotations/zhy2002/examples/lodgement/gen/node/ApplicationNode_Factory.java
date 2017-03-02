package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.ApplicationNodeContext;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationNode_Factory implements Factory<ApplicationNode> {
  private final MembersInjector<ApplicationNode> applicationNodeMembersInjector;

  private final Provider<ApplicationNodeContext> contextProvider;

  public ApplicationNode_Factory(
      MembersInjector<ApplicationNode> applicationNodeMembersInjector,
      Provider<ApplicationNodeContext> contextProvider) {
    assert applicationNodeMembersInjector != null;
    this.applicationNodeMembersInjector = applicationNodeMembersInjector;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  @Override
  public ApplicationNode get() {
    return MembersInjectors.injectMembers(
        applicationNodeMembersInjector, new ApplicationNode(contextProvider.get()));
  }

  public static Factory<ApplicationNode> create(
      MembersInjector<ApplicationNode> applicationNodeMembersInjector,
      Provider<ApplicationNodeContext> contextProvider) {
    return new ApplicationNode_Factory(applicationNodeMembersInjector, contextProvider);
  }
}
