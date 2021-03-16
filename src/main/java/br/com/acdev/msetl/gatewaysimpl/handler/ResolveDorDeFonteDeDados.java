package br.com.acdev.msetl.gatewaysimpl.handler;

import br.com.acdev.msetl.entity.Fonte;
import br.com.acdev.msetl.gateways.FonteDeDados;
import br.com.acdev.msetl.gatewaysimpl.FacebookFonteDeDados;
import br.com.acdev.msetl.gatewaysimpl.TwitterFonteDeDados;
import br.com.acdev.msetl.gatewaysimpl.WordPressFonteDados;

public class ResolveDorDeFonteDeDados {

    public FonteDeDados resolver(Fonte fonte){

        if(fonte.equals(Fonte.WORDPRESS)){
            return new WordPressFonteDados();
        }
        if(fonte.equals(Fonte.FACEBOOK)){
            return new FacebookFonteDeDados();
        }
        if(fonte.equals(Fonte.TWITTER)){
            return new TwitterFonteDeDados();
        }

        return null;
    }

}
