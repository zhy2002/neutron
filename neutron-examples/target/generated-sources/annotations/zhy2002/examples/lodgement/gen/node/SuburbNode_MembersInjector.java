package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.SuburbNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SuburbNode_MembersInjector implements MembersInjector<SuburbNode> {
  private final Provider<SuburbNodeComponent.Builder> builderProvider;

  public SuburbNode_MembersInjector(Provider<SuburbNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<SuburbNode> create(
      Provider<SuburbNodeComponent.Builder> builderProvider) {
    return new SuburbNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(SuburbNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      SuburbNode instance, Provider<SuburbNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
