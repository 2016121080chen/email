package com.autosendemail.email;

import java.util.Random;

/**
 * Created by wangshuai on 2017/9/7.
 */
public class EmailBodyTemplates {

    private static final String[] LIST_TEMPLATES_NEW ={
        "<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t<div>\n" + "\t\t<span style=\"font-size:13px;\">Dear manager,</span>\n" + "\t</div>\n" + "\t<div>\n" + "\t\t<span style=\"font-size:13px;\">Thanks for giving me an opportunity &nbsp;to promote our company Bosun mould.</span>\n" + "\t</div>\n" + "\t<div>\n" + "\t\t<br />\n" + "\t</div>\n" + "\t<div>\n" + "\t\t<span style=\"font-size:13px;\">We specialize in below kinds of injection molds for exporting worldwide:</span>\n" + "\t</div>\n" + "\t<div>\n" + "\t\t<br />\n" + "\t</div>\n" + "\t<div>\n" + "\t\t<span style=\"font-size:13px;\">- Common custom plastic molds</span>\n" + "\t</div>\n" + "\t<div>\n" + "\t\t<span style=\"font-size:13px;\">- High precision molds</span>\n" + "\t</div>\n" + "\t<div>\n" + "\t\t<span style=\"font-size:13px;\">- High Cavitation Injection Molds</span>\n" + "\t</div>\n" + "\t<div>\n" + "\t\t<span style=\"font-size:13px;\">- Large size molds</span>\n" + "\t</div>\n" + "\t<div>\n" + "\t\t<span style=\"font-size:13px;\">- Two Shot Molds</span>\n" + "\t</div>\n" + "\t<div>\n" + "\t\t<span style=\"font-size:13px;\">- Unscrewing Molds</span>\n" + "\t</div>\n" + "\t<div>\n" + "\t\t<span style=\"font-size:13px;\">- Gas Assist Molds</span>\n" + "\t</div>\n" + "\t<div>\n" + "\t\t<span style=\"font-size:13px;\">- Die Casting tools</span>\n" + "\t</div>\n" + "\t<div>\n" + "\t\t<br />\n" + "\t</div>\n" + "\t<div>\n" + "\t\t<span style=\"font-size:13px;\">If you are interested of us, please feel free to contact me for a quotation, we are all here to provide you service at any time, thank you!</span>\n" + "\t</div>\n" + "</div>\n" + "<div id=\"spnEditorSign\" style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t<div>\n" + "\t\tSincerely,\n" + "\t</div>\n" + "\t<div>\n" + "\t\t<span style=\"color:#17365D;font-family:Calibri;font-size:13px;\">sheena Liu</span>\n" + "\t</div>\n" + "\t<div>\n" + "\t\t<span style=\"color:#17365D;font-family:Calibri;font-size:13px;\">Overseas Marketing Dept.</span>\n" + "\t</div>\n" + "\t<div>\n" + "\t\t<span style=\"color:#E36C0A;font-family:Calibri;font-size:13px;\">------------------------------------------------------------------------------------</span>\n" + "\t</div>\n" + "\t<div>\n" + "\t\t<span style=\"font-family:Calibri;font-size:13px;\"><b><i><span style=\"color:#17365D;\">BOSUN Mould Technology Co.,LTD.</span></i></b></span>\n" + "\t</div>\n" + "\t<div>\n" + "\t\t<span style=\"font-size:13px;\"><span style=\"color:#17365D;font-family:Calibri;\">Email:</span><span style=\"color:blue;font-family:Calibri;\"><a href=\"mailto:phyllis@bosun-mould.com\">sheena@bosun-mould.com</a></span></span>\n" + "\t</div>\n" + "\t<div>\n" + "\t\t<span style=\"font-size:13px;\"><b><i><span style=\"color:#17365D;\">Cell: 0086 18576459878&nbsp; Skype:Sheena-Bosun Mould&nbsp;</span></i></b></span>\n" + "\t</div>\n" + "\t<div>\n" + "\t\t<span style=\"color:#17365D;font-family:Calibri;font-size:13px;\">Tel: 0086-0755-28947686&nbsp;&nbsp;&nbsp;Fax:0086-0755-28947976</span>\n" + "\t</div>\n" + "\t<div>\n" + "\t\t<span style=\"color:#17365D;font-family:Calibri;font-size:13px;\">Add: #3-B,1 Road, Buxinji industrial, Guanjingtou, Fenggang, Dongguan city, Guangdong, China.</span>\n" + "\t</div>\n" + "</div>"
        ,"<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t<div>\n" + "\t\t\t<span style=\"font-size:13px;\">Greetings,&nbsp;</span>\n" + "\t\t</div>\n" + "\t\t<div>\n" + "\t\t\t<span style=\"font-size:13px;\">Please allow me to promote our company to you.</span>\n" + "\t\t</div>\n" + "\t\t<div>\n" + "\t\t\t<span style=\"font-size:13px;\">BOSUN Molud is your one-stop shop for your molds &amp; molding products needs.&nbsp;</span>\n" + "\t\t</div>\n" + "\t\t<div>\n" + "\t\t\t<span style=\"font-size:13px;\">we works:</span>\n" + "\t\t</div>\n" + "\t\t<div>\n" + "\t\t\t<br />\n" + "\t\t</div>\n" + "\t\t<div>\n" + "\t\t\t<span style=\"font-size:13px;\">&nbsp;1) Cold &amp; Hot Runner / Single &amp; Multi-Cavity</span>\n" + "\t\t</div>\n" + "\t\t<div>\n" + "\t\t\t<span style=\"font-size:13px;\">&nbsp;2) Single &amp; Multi-Shot</span>\n" + "\t\t</div>\n" + "\t\t<div>\n" + "\t\t\t<span style=\"font-size:13px;\">&nbsp;3) Die Cast-Aluminum &amp; Zinc</span>\n" + "\t\t</div>\n" + "\t\t<div>\n" + "\t\t\t<span style=\"font-size:13px;\">&nbsp;4) Insert Molds&amp;blow molding</span>\n" + "\t\t</div>\n" + "\t\t<div>\n" + "\t\t\t<span style=\"font-size:13px;\">&nbsp;5) Prototype Tooling</span>\n" + "\t\t</div>\n" + "\t\t<div>\n" + "\t\t\t<span style=\"font-size:13px;\">&nbsp;6) Over molding &amp;stamping</span>\n" + "\t\t</div>\n" + "\t\t<div>\n" + "\t\t\t<span style=\"font-size:13px;\">&nbsp;7) Mass production for plastic parts or metal parts</span>\n" + "\t\t</div>\n" + "\t\t<div>\n" + "\t\t\t<span style=\"font-size:13px;\">If you are interested of us, please feel free to contact me for a quotation, we are all here to provide you service at any time, thank you!</span>\n" + "\t\t</div>\n" + "\t</div>\n" + "\t<div id=\"spnEditorSign\" style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t<div>\n" + "\t\t\tSincerely,\n" + "\t\t</div>\n" + "\t\t<div>\n" + "\t\t\t<span style=\"color:#17365D;font-family:Calibri;font-size:13px;\">sheena Liu</span>\n" + "\t\t</div>\n" + "\t\t<div>\n" + "\t\t\t<span style=\"color:#17365D;font-family:Calibri;font-size:13px;\">Overseas Marketing Dept.</span>\n" + "\t\t</div>\n" + "\t\t<div>\n" + "\t\t\t<span style=\"color:#E36C0A;font-family:Calibri;font-size:13px;\">------------------------------------------------------------------------------------</span>\n" + "\t\t</div>\n" + "\t\t<div>\n" + "\t\t\t<span style=\"font-family:Calibri;font-size:13px;\"><b><i><span style=\"color:#17365D;\">BOSUN Mould Technology Co.,LTD.</span></i></b></span>\n" + "\t\t</div>\n" + "\t\t<div>\n" + "\t\t\t<span style=\"font-size:13px;\"><span style=\"color:#17365D;font-family:Calibri;\">Email:</span><span style=\"color:blue;font-family:Calibri;\"><a href=\"mailto:phyllis@bosun-mould.com\">sheena@bosun-mould.com</a></span></span>\n" + "\t\t</div>\n" + "\t\t<div>\n" + "\t\t\t<span style=\"font-size:13px;\"><b><i><span style=\"color:#17365D;\">Cell: 0086 18576459878&nbsp; Skype:Sheena-Bosun Mould&nbsp;</span></i></b></span>\n" + "\t\t</div>\n" + "\t\t<div>\n" + "\t\t\t<span style=\"color:#17365D;font-family:Calibri;font-size:13px;\">Tel: 0086-0755-28947686&nbsp;&nbsp;&nbsp;Fax:0086-0755-28947976</span>\n" + "\t\t</div>\n" + "\t\t<div>\n" + "\t\t\t<span style=\"color:#17365D;font-family:Calibri;font-size:13px;\">Add: #3-B,1 Road, Buxinji industrial, Guanjingtou, Fenggang, Dongguan city, Guangdong, China.</span>\n" + "\t\t</div>\n" + "\t</div>\n" + "<br />\n" + "</div>"
        ,"<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t<div>\n" + "\t\t\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t\t\t<div>\n" + "\t\t\t\t\t<span style=\"font-size:13px;\">Greetings,</span>\n" + "\t\t\t\t</div>\n" + "\t\t\t\t<div>\n" + "\t\t\t\t\t<span style=\"font-size:13px;\">I am writing to you to thank you for giving me an opportunity to promote our company Bosun mould.</span>\n" + "\t\t\t\t</div>\n" + "\t\t\t\t<div>\n" + "\t\t\t\t\t<span style=\"font-size:13px;\">Bosun mould is a very professional mould manufacturer in China.</span>\n" + "\t\t\t\t</div>\n" + "\t\t\t\t<div>\n" + "\t\t\t\t\t<br />\n" + "\t\t\t\t</div>\n" + "\t\t\t\t<div>\n" + "\t\t\t\t\t<span style=\"font-size:13px;\">We offer as followings:</span>\n" + "\t\t\t\t</div>\n" + "\t\t\t\t<div>\n" + "\t\t\t\t\t<br />\n" + "\t\t\t\t</div>\n" + "\t\t\t\t<div>\n" + "\t\t\t\t\t<span style=\"font-size:13px;\">1.Injection Molds;</span>\n" + "\t\t\t\t</div>\n" + "\t\t\t\t<div>\n" + "\t\t\t\t\t<span style=\"font-size:13px;\">2.Die casting molds;</span>\n" + "\t\t\t\t</div>\n" + "\t\t\t\t<div>\n" + "\t\t\t\t\t<span style=\"font-size:13px;\">3.Multi-material/Multi-color Molds;</span>\n" + "\t\t\t\t</div>\n" + "\t\t\t\t<div>\n" + "\t\t\t\t\t<span style=\"font-size:13px;\">4.Prototype Tooling;</span>\n" + "\t\t\t\t</div>\n" + "\t\t\t\t<div>\n" + "\t\t\t\t\t<span style=\"font-size:13px;\">5.Compression Molds;</span>\n" + "\t\t\t\t</div>\n" + "\t\t\t\t<div>\n" + "\t\t\t\t\t<span style=\"font-size:13px;\">6.Stack Molds and etc.</span>\n" + "\t\t\t\t</div>\n" + "\t\t\t\t<div>\n" + "\t\t\t\t\t<span style=\"font-size:13px;\">If you are interested of us, please don't hesitate to contact me for a quotation.</span>\n" + "\t\t\t\t</div>\n" + "\t\t\t</div>\n" + "\t\t\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t\t\t<span style=\"font-size:13px;\"><br />\n" + "</span>\n" + "\t\t\t</div>\n" + "\t\t\t<div id=\"spnEditorSign\" style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t\t\t<div>\n" + "\t\t\t\t\tSincerely,\n" + "\t\t\t\t</div>\n" + "\t\t\t\t<div>\n" + "\t\t\t\t\t<span style=\"color:#17365D;font-family:Calibri;font-size:13px;\">sheena Liu</span>\n" + "\t\t\t\t</div>\n" + "\t\t\t\t<div>\n" + "\t\t\t\t\t<span style=\"color:#17365D;font-family:Calibri;font-size:13px;\">Overseas Marketing Dept.</span>\n" + "\t\t\t\t</div>\n" + "\t\t\t\t<div>\n" + "\t\t\t\t\t<span style=\"color:#E36C0A;font-family:Calibri;font-size:13px;\">------------------------------------------------------------------------------------</span>\n" + "\t\t\t\t</div>\n" + "\t\t\t\t<div>\n" + "\t\t\t\t\t<span style=\"font-family:Calibri;font-size:13px;\"><b><i><span style=\"color:#17365D;\">BOSUN Mould Technology Co.,LTD.</span></i></b></span>\n" + "\t\t\t\t</div>\n" + "\t\t\t\t<div>\n" + "\t\t\t\t\t<span style=\"font-size:13px;\"><span style=\"color:#17365D;font-family:Calibri;\">Email:</span><span style=\"color:blue;font-family:Calibri;\"><a href=\"mailto:phyllis@bosun-mould.com\">sheena@bosun-mould.com</a></span></span>\n" + "\t\t\t\t</div>\n" + "\t\t\t\t<div>\n" + "\t\t\t\t\t<span style=\"font-size:13px;\"><b><i><span style=\"color:#17365D;\">Cell: 0086 18576459878&nbsp; Skype:Sheena-Bosun Mould&nbsp;</span></i></b></span>\n" + "\t\t\t\t</div>\n" + "\t\t\t\t<div>\n" + "\t\t\t\t\t<span style=\"color:#17365D;font-family:Calibri;font-size:13px;\">Tel: 0086-0755-28947686&nbsp;&nbsp;&nbsp;Fax:0086-0755-28947976</span>\n" + "\t\t\t\t</div>\n" + "\t\t\t\t<div>\n" + "\t\t\t\t\t<span style=\"color:#17365D;font-family:Calibri;font-size:13px;\">Add: #3-B,1 Road, Buxinji industrial, Guanjingtou, Fenggang, Dongguan city, Guangdong, China.</span>\n" + "\t\t\t\t</div>\n" + "\t\t\t</div>\n" + "<br />\n" + "\t\t</div>\n" + "\t</div>\n" + "</div>"
        ,"<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t<div>\n" + "\t\t\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t\t\t<div>\n" + "\t\t\t\t\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t<span style=\"font-size:13px;\">Dear manager,</span>\n" + "\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t<span style=\"font-size:13px;\">Thanks for giving me an opportunity &nbsp;to promote our company Bosun mould.</span>\n" + "\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t<br />\n" + "\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t<span style=\"font-size:13px;\">BOSUN mould is a very professional &nbsp;molds or molded products manufacturer in china, We offer as followings:</span>\n" + "\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t<span style=\"font-size:13px;\">1.Plastic injection Mold(plastic parts);</span>\n" + "\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t<span style=\"font-size:13px;\">2.Die Casting Mold and Die Casting Parts(Aluminum and Zinc);</span>\n" + "\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t<span style=\"font-size:13px;\">3.Inserts&amp;blow mold;</span>\n" + "\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t<span style=\"font-size:13px;\">4.Prototype Tooling;</span>\n" + "\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t<span style=\"font-size:13px;\">5.Over molding &amp;stamping</span>\n" + "\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t<span style=\"font-size:13px;\">6.Mass production for plastic parts or metal parts</span>\n" + "\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t<span style=\"font-size:13px;\">We also have our own injection room that can provide you one-stop service .</span>\n" + "\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t<br />\n" + "\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t<span style=\"font-size:13px;\">If you are interested of us, please feel free to contact me for a quotation, we are all here to provide you service at any time, thank you!</span>\n" + "\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t</div>\n" + "\t\t\t\t\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t\t\t\t\t<span style=\"font-size:13px;\"><br />\n" + "</span>\n" + "\t\t\t\t\t</div>\n" + "\t\t\t\t\t<div id=\"spnEditorSign\" style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\tSincerely,\n" + "\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t<span style=\"color:#17365D;font-family:Calibri;font-size:13px;\">sheena Liu</span>\n" + "\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t<span style=\"color:#17365D;font-family:Calibri;font-size:13px;\">Overseas Marketing Dept.</span>\n" + "\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t<span style=\"color:#E36C0A;font-family:Calibri;font-size:13px;\">------------------------------------------------------------------------------------</span>\n" + "\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t<span style=\"font-family:Calibri;font-size:13px;\"><b><i><span style=\"color:#17365D;\">BOSUN Mould Technology Co.,LTD.</span></i></b></span>\n" + "\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t<span style=\"font-size:13px;\"><span style=\"color:#17365D;font-family:Calibri;\">Email:</span><span style=\"color:blue;font-family:Calibri;\"><a href=\"mailto:phyllis@bosun-mould.com\">sheena@bosun-mould.com</a></span></span>\n" + "\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t<span style=\"font-size:13px;\"><b><i><span style=\"color:#17365D;\">Cell: 0086 18576459878&nbsp; Skype:Sheena-Bosun Mould&nbsp;</span></i></b></span>\n" + "\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t<span style=\"color:#17365D;font-family:Calibri;font-size:13px;\">Tel: 0086-0755-28947686&nbsp;&nbsp;&nbsp;Fax:0086-0755-28947976</span>\n" + "\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t<span style=\"color:#17365D;font-family:Calibri;font-size:13px;\">Add: #3-B,1 Road, Buxinji industrial, Guanjingtou, Fenggang, Dongguan city, Guangdong, China.</span>\n" + "\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t</div>\n" + "<br />\n" + "\t\t\t\t</div>\n" + "\t\t\t</div>\n" + "\t\t</div>\n" + "\t</div>\n" + "</div>"
        ,"<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t<div>\n" + "\t\t\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t\t\t<div>\n" + "\t\t\t\t\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">Greetings !</span>\n" + "\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">Thanks for allowing me to promote our company Bosun mould.</span>\n" + "\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">If you have a project that need mould , i recommend you to choose BOSUN MOULD, We offer as followings:</span>\n" + "\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">1) Cold &amp; Hot Runner / Single &amp; Multi-Cavity</span>\n" + "\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">2) Single &amp; Multi-Shot</span>\n" + "\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">3) Die Cast-Aluminum &amp; Zinc</span>\n" + "\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">4) Inserts</span>\n" + "\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">5) Prototype Tooling</span>\n" + "\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">6) Over molding</span>\n" + "\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">7) Mass production for plastic parts or metal parts</span>\n" + "\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">We also have own injection room that can provide you one-stop service .</span>\n" + "\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t<br />\n" + "\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">If you are interested of us, please feel free to contact me for a quotation, thank you!</span>\n" + "\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\"><br />\n" + "</span>\n" + "\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t<div id=\"spnEditorSign\" style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\tSincerely,\n" + "\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t<span style=\"color:#17365D;font-family:Calibri;font-size:13px;\">sheena Liu</span>\n" + "\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t<span style=\"color:#17365D;font-family:Calibri;font-size:13px;\">Overseas Marketing Dept.</span>\n" + "\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t<span style=\"color:#E36C0A;font-family:Calibri;font-size:13px;\">------------------------------------------------------------------------------------</span>\n" + "\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t<span style=\"font-family:Calibri;font-size:13px;\"><b><i><span style=\"color:#17365D;\">BOSUN Mould Technology Co.,LTD.</span></i></b></span>\n" + "\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\"><span style=\"color:#17365D;font-family:Calibri;\">Email:</span><span style=\"color:blue;font-family:Calibri;\"><a href=\"mailto:phyllis@bosun-mould.com\">sheena@bosun-mould.com</a></span></span>\n" + "\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\"><b><i><span style=\"color:#17365D;\">Cell: 0086 18576459878&nbsp; Skype:Sheena-Bosun Mould&nbsp;</span></i></b></span>\n" + "\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t<span style=\"color:#17365D;font-family:Calibri;font-size:13px;\">Tel: 0086-0755-28947686&nbsp;&nbsp;&nbsp;Fax:0086-0755-28947976</span>\n" + "\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t<span style=\"color:#17365D;font-family:Calibri;font-size:13px;\">Add: #3-B,1 Road, Buxinji industrial, Guanjingtou, Fenggang, Dongguan city, Guangdong, China.</span>\n" + "\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t</div>\n" + "<br />\n" + "\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t</div>\n" + "\t\t\t\t</div>\n" + "\t\t\t</div>\n" + "\t\t</div>\n" + "\t</div>\n" + "</div>"
        ,"<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t<div>\n" + "\t\t\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t\t\t<div>\n" + "\t\t\t\t\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">Greetings ,</span>\n" + "\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">Please allow me to promote our company BOSUN MOULD.</span>\n" + "\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">BOSUN Mould specialize in mould making ,Covering automotive, electronics, toys, Medical Items, family appliance, cosmetics and etc.</span>\n" + "\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">we works:</span>\n" + "\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">1.Injection Molds;</span>\n" + "\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">2.Multi-material/Multi-color Molds;</span>\n" + "\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">3.Prototype Tooling;</span>\n" + "\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">5.Compression Molds;</span>\n" + "\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">6.Stack Molds and etc.</span>\n" + "\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">We also have our own injection room that can provide you one-stop service .</span>\n" + "\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t<br />\n" + "\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">If you are interested of us, please feel free to contact me for a quotation, thank you!</span>\n" + "\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\"><br />\n" + "</span>\n" + "\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t<div id=\"spnEditorSign\" style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\tSincerely,\n" + "\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t<span style=\"color:#17365D;font-family:Calibri;font-size:13px;\">sheena Liu</span>\n" + "\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t<span style=\"color:#17365D;font-family:Calibri;font-size:13px;\">Overseas Marketing Dept.</span>\n" + "\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t<span style=\"color:#E36C0A;font-family:Calibri;font-size:13px;\">------------------------------------------------------------------------------------</span>\n" + "\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-family:Calibri;font-size:13px;\"><b><i><span style=\"color:#17365D;\">BOSUN Mould Technology Co.,LTD.</span></i></b></span>\n" + "\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\"><span style=\"color:#17365D;font-family:Calibri;\">Email:</span><span style=\"color:blue;font-family:Calibri;\"><a href=\"mailto:phyllis@bosun-mould.com\">sheena@bosun-mould.com</a></span></span>\n" + "\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\"><b><i><span style=\"color:#17365D;\">Cell: 0086 18576459878&nbsp; Skype:Sheena-Bosun Mould&nbsp;</span></i></b></span>\n" + "\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t<span style=\"color:#17365D;font-family:Calibri;font-size:13px;\">Tel: 0086-0755-28947686&nbsp;&nbsp;&nbsp;Fax:0086-0755-28947976</span>\n" + "\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t<span style=\"color:#17365D;font-family:Calibri;font-size:13px;\">Add: #3-B,1 Road, Buxinji industrial, Guanjingtou, Fenggang, Dongguan city, Guangdong, China.</span>\n" + "\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t</div>\n" + "<br />\n" + "\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t</div>\n" + "\t\t\t\t</div>\n" + "\t\t\t</div>\n" + "\t\t</div>\n" + "\t</div>\n" + "</div>"
        ,"<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t<div>\n" + "\t\t\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t\t\t<div>\n" + "\t\t\t\t\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">Dear Sir,</span>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">Thanks for giving &nbsp;me an opportunity to promote our company Bosun mould.</span>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">BOSUN MOULD is a professional plastic and metal molds factory, also we are the injection molding and metal die casting manufacturer.</span>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t<br />\n" + "\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">If you need to produce the plastic and metal products, contain the development and design service, Please send your 3D/2D drawings or samples to us &nbsp;for a quotation .&nbsp;</span>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">We are here to provide you with service at any time.</span>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t<br />\n" + "\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">Nice day and give my best wishes!</span>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\"><br />\n" + "</span>\n" + "\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t<div id=\"spnEditorSign\" style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\tSincerely,\n" + "\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"color:#17365D;font-family:Calibri;font-size:13px;\">sheena Liu</span>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"color:#17365D;font-family:Calibri;font-size:13px;\">Overseas Marketing Dept.</span>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"color:#E36C0A;font-family:Calibri;font-size:13px;\">------------------------------------------------------------------------------------</span>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-family:Calibri;font-size:13px;\"><b><i><span style=\"color:#17365D;\">BOSUN Mould Technology Co.,LTD.</span></i></b></span>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\"><span style=\"color:#17365D;font-family:Calibri;\">Email:</span><span style=\"color:blue;font-family:Calibri;\"><a href=\"mailto:phyllis@bosun-mould.com\">sheena@bosun-mould.com</a></span></span>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\"><b><i><span style=\"color:#17365D;\">Cell: 0086 18576459878&nbsp; Skype:Sheena-Bosun Mould&nbsp;</span></i></b></span>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"color:#17365D;font-family:Calibri;font-size:13px;\">Tel: 0086-0755-28947686&nbsp;&nbsp;&nbsp;Fax:0086-0755-28947976</span>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"color:#17365D;font-family:Calibri;font-size:13px;\">Add: #3-B,1 Road, Buxinji industrial, Guanjingtou, Fenggang, Dongguan city, Guangdong, China.</span>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "<br />\n" + "\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t</div>\n" + "\t\t\t\t</div>\n" + "\t\t\t</div>\n" + "\t\t</div>\n" + "\t</div>\n" + "</div>"
        ,"<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t<div>\n" + "\t\t\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t\t\t<div>\n" + "\t\t\t\t\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">Dear friends,</span>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">Good day!</span>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">I would like to thank you for your reading my letter. It is very pleased to communicate with you for the possibility of working together.</span>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">&nbsp;</span>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">Our company BOSUN Mould is a professional mould manufacturer, &nbsp;has over 17 years¡¯ experience in plastic injection molds and Precise molds for plastic parts &amp;metal parts.</span>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">&nbsp;</span>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">Good quality,competitive price and on time delivery .</span>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">Some projects that need our assistance, please don't hesitate to contact me, we are here to provide you service at any time.</span>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">&nbsp;</span>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\">Give my best wishes!</span>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t<div style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\"><br />\n" + "</span>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t<div id=\"spnEditorSign\" style=\"font-family:Arial;font-size:14px;background-color:#FFFFFF;\">\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSincerely,\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"color:#17365D;font-family:Calibri;font-size:13px;\">sheena Liu</span>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"color:#17365D;font-family:Calibri;font-size:13px;\">Overseas Marketing Dept.</span>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"color:#E36C0A;font-family:Calibri;font-size:13px;\">------------------------------------------------------------------------------------</span>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-family:Calibri;font-size:13px;\"><b><i><span style=\"color:#17365D;\">BOSUN Mould Technology Co.,LTD.</span></i></b></span>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\"><span style=\"color:#17365D;font-family:Calibri;\">Email:</span><span style=\"color:blue;font-family:Calibri;\"><a href=\"mailto:phyllis@bosun-mould.com\">sheena@bosun-mould.com</a></span></span>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:13px;\"><b><i><span style=\"color:#17365D;\">Cell: 0086 18576459878&nbsp; Skype:Sheena-Bosun Mould&nbsp;</span></i></b></span>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"color:#17365D;font-family:Calibri;font-size:13px;\">Tel: 0086-0755-28947686&nbsp;&nbsp;&nbsp;Fax:0086-0755-28947976</span>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"color:#17365D;font-family:Calibri;font-size:13px;\">Add: #3-B,1 Road, Buxinji industrial, Guanjingtou, Fenggang, Dongguan city, Guangdong, China.</span>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "<br />\n" + "\t\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t\t</div>\n" + "\t\t\t\t\t</div>\n" + "\t\t\t\t</div>\n" + "\t\t\t</div>\n" + "\t\t</div>\n" + "\t</div>\n" + "</div>"
    };

    private static final String[] LIST_SUBJECTS_NEW = {
            "Injection molds/molding/plastic parts"
            ,"Plastic Injection Mold / Die-Casting"
            ,"Plastic injection molds/molding/Die-cast Aluminum"
            ,"Injection molds/molding/molded products"
            ,"Injection molds/molding/Tool making"
            ,"Injection moulds/Moulding/plastic&metal parts"
            ,"Injection molds/Die Cast Dies/Moulding"
            ,"Injection moulds/moulding/Prototyping"
            ,"plastic injection moulds/Tooling/Dies"
            ,"Plastic injection moulds/Dies/tooling"
            ,"plastic injection moulds/moulding/plastic parts"
            ,"Injection moulds/Tooling/Dies"
            ,"Plastic Molds/injection molding/Tooling"
            ,"Injection molds/molding/Tools"
            ,"Plastic injection molds/Die Cast Dies/Moulding"
            ,"Injection molds/Dies/Tooling"
            ,"Plastic injection molds/molding/Tool making"
            ,"Plastic molds/moulding/Tools"
            ,"Injection molds/Die Cast Dies/Moulding"
    };

    public static String getBoay(){
            int max=LIST_TEMPLATES_NEW.length;;
            int min=0;
            Random random = new Random();
            int index = random.nextInt(max)%(max-min+1) + min;
            return LIST_TEMPLATES_NEW[index];
    }


    public static String getSubject(){
            int max=LIST_SUBJECTS_NEW.length;;
            int min=0;
            Random random = new Random();
            int index = random.nextInt(max)%(max-min+1) + min;
            return LIST_SUBJECTS_NEW[index];
    }
}
