import Process from '../components/Process';
import Home from '../components/Home';
import Setting from '../components/settings';

let menu = [
    { menuNameEn: "Home", menuNameAr: "الصفحة الرئيسية", menuURL: "/", componentToRender: Home },
    { menuNameEn: "Configure", menuNameAr: "اختبار جيت", menuURL: "/configure", componentToRender: Setting },
    { menuNameEn: "Process", menuNameAr: "حول", menuURL: "/process", componentToRender: Process }
];

export default menu;