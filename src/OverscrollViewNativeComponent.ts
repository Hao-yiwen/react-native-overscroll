import { Platform, View } from 'react-native';
import type { NativeProps } from './NativeOverscrollView';

type OverscrollViewType = typeof View | React.ComponentType<NativeProps>;

let OverscrollView: OverscrollViewType = View;

if (Platform.OS === 'android') {
  OverscrollView = require('./OverscrollViewNativeComponent').default;
}

export default OverscrollView;
