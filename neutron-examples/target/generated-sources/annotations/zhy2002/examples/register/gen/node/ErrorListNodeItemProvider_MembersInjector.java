package zhy2002.examples.register.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ErrorListNodeItemProvider_MembersInjector
    implements MembersInjector<ErrorListNodeItemProvider> {
  private final MembersInjector<ErrorNode> errorNodeInjectorMembersInjector;

  public ErrorListNodeItemProvider_MembersInjector(
      MembersInjector<ErrorNode> errorNodeInjectorMembersInjector) {
    assert errorNodeInjectorMembersInjector != null;
    this.errorNodeInjectorMembersInjector = errorNodeInjectorMembersInjector;
  }

  public static MembersInjector<ErrorListNodeItemProvider> create(
      MembersInjector<ErrorNode> errorNodeInjectorMembersInjector) {
    return new ErrorListNodeItemProvider_MembersInjector(errorNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(ErrorListNodeItemProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.errorNodeInjector = errorNodeInjectorMembersInjector;
  }

  public static void injectErrorNodeInjector(
      ErrorListNodeItemProvider instance, MembersInjector<ErrorNode> errorNodeInjector) {
    instance.errorNodeInjector = errorNodeInjector;
  }
}
