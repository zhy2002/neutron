package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.YearNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class YearNode_MembersInjector implements MembersInjector<YearNode> {
  private final Provider<YearNodeComponent.Builder> builderProvider;

  public YearNode_MembersInjector(Provider<YearNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<YearNode> create(
      Provider<YearNodeComponent.Builder> builderProvider) {
    return new YearNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(YearNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      YearNode instance, Provider<YearNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
