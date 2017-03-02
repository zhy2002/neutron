package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.TitleNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TitleNode_MembersInjector implements MembersInjector<TitleNode> {
  private final Provider<TitleNodeComponent.Builder> builderProvider;

  public TitleNode_MembersInjector(Provider<TitleNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<TitleNode> create(
      Provider<TitleNodeComponent.Builder> builderProvider) {
    return new TitleNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(TitleNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      TitleNode instance, Provider<TitleNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
