import codegenNativeComponent from 'react-native/Libraries/Utilities/codegenNativeComponent';
import { Platform, View, type ViewProps } from 'react-native';

interface NativeProps extends ViewProps {
  bounce: boolean;
}

type OverscrollViewType = typeof View | React.ComponentType<NativeProps>;

let OverscrollView: OverscrollViewType = View;

if (Platform.OS === 'android') {
  OverscrollView = codegenNativeComponent<NativeProps>('OverscrollView');
}

export default OverscrollView;
