package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CurrentEmploymentListNodeItemProvider_Factory
    implements Factory<CurrentEmploymentListNodeItemProvider> {
  private final MembersInjector<CurrentEmploymentListNodeItemProvider>
      currentEmploymentListNodeItemProviderMembersInjector;

  public CurrentEmploymentListNodeItemProvider_Factory(
      MembersInjector<CurrentEmploymentListNodeItemProvider>
          currentEmploymentListNodeItemProviderMembersInjector) {
    assert currentEmploymentListNodeItemProviderMembersInjector != null;
    this.currentEmploymentListNodeItemProviderMembersInjector =
        currentEmploymentListNodeItemProviderMembersInjector;
  }

  @Override
  public CurrentEmploymentListNodeItemProvider get() {
    return MembersInjectors.injectMembers(
        currentEmploymentListNodeItemProviderMembersInjector,
        new CurrentEmploymentListNodeItemProvider());
  }

  public static Factory<CurrentEmploymentListNodeItemProvider> create(
      MembersInjector<CurrentEmploymentListNodeItemProvider>
          currentEmploymentListNodeItemProviderMembersInjector) {
    return new CurrentEmploymentListNodeItemProvider_Factory(
        currentEmploymentListNodeItemProviderMembersInjector);
  }
}
