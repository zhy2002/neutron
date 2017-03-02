package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ErrorListNodeItemProvider_Factory implements Factory<ErrorListNodeItemProvider> {
  private final MembersInjector<ErrorListNodeItemProvider> errorListNodeItemProviderMembersInjector;

  public ErrorListNodeItemProvider_Factory(
      MembersInjector<ErrorListNodeItemProvider> errorListNodeItemProviderMembersInjector) {
    assert errorListNodeItemProviderMembersInjector != null;
    this.errorListNodeItemProviderMembersInjector = errorListNodeItemProviderMembersInjector;
  }

  @Override
  public ErrorListNodeItemProvider get() {
    return MembersInjectors.injectMembers(
        errorListNodeItemProviderMembersInjector, new ErrorListNodeItemProvider());
  }

  public static Factory<ErrorListNodeItemProvider> create(
      MembersInjector<ErrorListNodeItemProvider> errorListNodeItemProviderMembersInjector) {
    return new ErrorListNodeItemProvider_Factory(errorListNodeItemProviderMembersInjector);
  }
}
