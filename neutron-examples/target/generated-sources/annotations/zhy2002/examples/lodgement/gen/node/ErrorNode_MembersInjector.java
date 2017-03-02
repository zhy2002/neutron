package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ErrorNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ErrorNode_MembersInjector implements MembersInjector<ErrorNode> {
  private final Provider<ErrorNodeComponent.Builder> builderProvider;

  public ErrorNode_MembersInjector(Provider<ErrorNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ErrorNode> create(
      Provider<ErrorNodeComponent.Builder> builderProvider) {
    return new ErrorNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ErrorNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ErrorNode instance, Provider<ErrorNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
