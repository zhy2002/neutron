package zhy2002.examples.register.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.register.gen.di.RepeatPasswordNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RepeatPasswordNode_MembersInjector
    implements MembersInjector<RepeatPasswordNode> {
  private final Provider<RepeatPasswordNodeComponent.Builder> builderProvider;

  public RepeatPasswordNode_MembersInjector(
      Provider<RepeatPasswordNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<RepeatPasswordNode> create(
      Provider<RepeatPasswordNodeComponent.Builder> builderProvider) {
    return new RepeatPasswordNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(RepeatPasswordNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      RepeatPasswordNode instance, Provider<RepeatPasswordNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
