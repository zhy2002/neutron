package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.LastNameNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LastNameNode_MembersInjector implements MembersInjector<LastNameNode> {
  private final Provider<LastNameNodeComponent.Builder> builderProvider;

  public LastNameNode_MembersInjector(Provider<LastNameNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<LastNameNode> create(
      Provider<LastNameNodeComponent.Builder> builderProvider) {
    return new LastNameNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(LastNameNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      LastNameNode instance, Provider<LastNameNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
