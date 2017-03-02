package zhy2002.neutron;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NodeFinder_Factory implements Factory<NodeFinder> {
  private static final NodeFinder_Factory INSTANCE = new NodeFinder_Factory();

  @Override
  public NodeFinder get() {
    return new NodeFinder();
  }

  public static Factory<NodeFinder> create() {
    return INSTANCE;
  }
}
