package zhy2002.examples.lodgement.node;

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
public final class ApplicationNodeImpl_Factory implements Factory<ApplicationNodeImpl> {
  private final MembersInjector<ApplicationNodeImpl> applicationNodeImplMembersInjector;

  private final Provider<ApplicationNodeContext> contextProvider;

  public ApplicationNodeImpl_Factory(
      MembersInjector<ApplicationNodeImpl> applicationNodeImplMembersInjector,
      Provider<ApplicationNodeContext> contextProvider) {
    assert applicationNodeImplMembersInjector != null;
    this.applicationNodeImplMembersInjector = applicationNodeImplMembersInjector;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  @Override
  public ApplicationNodeImpl get() {
    return MembersInjectors.injectMembers(
        applicationNodeImplMembersInjector, new ApplicationNodeImpl(contextProvider.get()));
  }

  public static Factory<ApplicationNodeImpl> create(
      MembersInjector<ApplicationNodeImpl> applicationNodeImplMembersInjector,
      Provider<ApplicationNodeContext> contextProvider) {
    return new ApplicationNodeImpl_Factory(applicationNodeImplMembersInjector, contextProvider);
  }
}
